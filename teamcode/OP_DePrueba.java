package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


/**
 * This file contains an minimal example of a Linear "OpMode". An OpMode is a 'program' that runs in either
 * the autonomous or the teleop period of an FTC match. The names of OpModes appear on the menu
 * of the FTC Driver Station. When an selection is made from the menu, the corresponding OpMode
 * class is instantiated on the Robot Controller and executed.
 *
 * This particular OpMode just executes a basic Tank Drive Teleop for a two wheeled robot
 * It includes all the skeletal structure that all linear OpModes contain.
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

@Autonomous(name="ete", group="Linear Opmode")

public class OP_DePrueba extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
   private P_TZNA_W3HG ojas;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

          ojas = new P_TZNA_W3HG(hardwareMap);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

          ojas.FORWARD(72.0,true);
          sleep(100);//avanza
          ojas.Turn(-40.0,0.5,1500);//checa bien estos valores
            telemetry.addData("hasta ahorita va bien","0");
          sleep(100);//deja el wobble
          ojas.Turn(40.0,0.5,1500);//checa bien estos valores
          sleep(100);//retrocede a posicion inicial o eso creo
          ojas.Strafe(22,false);//se mueve a la izq y aqui shootea
            // Show the elapsed game time and wheel power.
            telemetry.addData(" awebo si jala","2");
            telemetry.addData("X","30");

            telemetry.update();
        }
    }
}
