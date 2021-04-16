package org.firstinspires.ftc.teamcode;
/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */



import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;



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

@Autonomous(name="La Coreografia", group="Linear Opmode")
//@Disabled
public class Ya extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private static DcMotor leftDriveF = null;
    private static DcMotor rightDriveF = null;
    private static DcMotor leftDriveB = null;
    private static DcMotor rightDriveB = null;

    static final double COUNTS_PER_MOTOR_REV  = 383.6;
    static final double DRIVE_GEAR_REDUCTION  = .5;
    static final double WHEEL_DIAMETER_INCHES = 96;
    static final double COUNTS_PER_INCH = ((WHEEL_DIAMETER_INCHES * 3.14159)/ 25.4)
            /(COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION);
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.addData("LEE CON ATENCION: ","1.- inicializa el programa pero checa el programa si quieres");
        telemetry.addData("2.-","pon la cancion 'CANT STOP THE FEELING'(justin timberlake)");
        telemetry.addData("OJO ","No prometo que este bien cordinada ;)");
        telemetry.update();

        // Initialize the hardware variables. Note that the strings used here as parameters
        // to 'get' must correspond to the names assigned during the robot configuration
        // step (using the FTC Robot Controller app on the phone).
        Mapita(hardwareMap);
        // Wait for the game to start (driver presses PLAY)
        leftDriveF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDriveF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftDriveB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDriveB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftDriveF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);//................................
        rightDriveF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftDriveB.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDriveB.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {


            TurnLeft(7.42);
            TurnRigth(7.42);
            //paso adelaante, paso atras
            TurnLeft(7.42);
            TurnRigth(7.42);
            //paso aelante, paso atras
            TurnLeft(7.42);
            TurnRigth(7.42);
            //paso aelante,paso atras
            TurnLeft(7.42);
            TurnRigth(7.42);
            //paso aelante, paso atras
            TurnLeft(7.42);
            TurnRigth(7.42);
            //paso aelante,paso atras
            FORWARD(10.0);
            //Avanza y toma la pista de baile
            TurnLeft(7.42);
            TurnRigth(7.42);
            //agarra el Flow
            TurnRigth(22.26);//creo que es la medida de la circunferencia que el robot hace
            //gira para presumir el vestido
            StrafeRight(10.0);
            StrafeLeft(20.0);
            StrafeRight(10.0);
            //se desplaza como "la let it go"
            TurnRigth(5.0);
            TurnLeft(10.0);
            //se acerca como tigre a su presa @pareja
            TurnRigth(10.0);
            TurnLeft(10.0);
            //(nomas pa separar los pasos)
            TurnRigth(10.0);
            TurnLeft(10.0);
            //aqui choca con una vato mamado por quedarsele viendo a alguien
            TurnRigth(10.0);
            TurnLeft(5.0);
            //aqui retrocede y retoma posicion
            double giro = 22.26 * 2; TurnLeft(giro);
            //se hace pndjo gira y finge que no paso
            StrafeRight(15.0);
            //pasito a la derecha para evadir semejante montaña de musculo
            StrafeToLeft(30.0);
            //se desplaza a lo ada madrina hacia la izquierda para retomar posicion
            StrafeToRight(30.0);
            StrafeToLeft(30.0);
            StrafeToRight(30.0);
            StrafeToLeft(30.0);
            StrafeToRight(30.0);
            //hace los pasos varias veces para sentirse la reina de la noche
            //y para que la montaña humana piense que esta fumado o algo y no lo desmadre
            double giro2 = 22.26 * 3; TurnRigth(giro2);
            //da sus vueltas para demostrar quien es la reina de la noche y el DJ quita la
            //musica porque esa cancion ya le aburrio

            ParateRobot();

            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("Sha", " la puedes parar o te la quedas oiendo no c pero no t conviene dejarlo asi");
            telemetry.update();
        }
    }
    /*
     *...........................................................................................
     * ......................LOS_PASOS_DE_BAILE..................................................
     *...........................................................................................
     */

    public void Mapita(HardwareMap HwMap) {
        leftDriveF = HwMap.get(DcMotor.class, "left_driveF");
        rightDriveF = HwMap.get(DcMotor.class, "right_driveF");
        leftDriveB = HwMap.get(DcMotor.class, "left_driveB");
        rightDriveB = HwMap.get(DcMotor.class, "right_driveB");

        // Most robots need the motor on one side to be reversed to drive forward
        // Reverse the motor that runs backwards when connected directly to the battery
        leftDriveF.setDirection(DcMotor.Direction.FORWARD);
        rightDriveF.setDirection(DcMotor.Direction.REVERSE);
        leftDriveB.setDirection(DcMotor.Direction.FORWARD);
        rightDriveB.setDirection(DcMotor.Direction.REVERSE);
    }
    //..........................................................................................

    public static void FORWARD(double Inches) {
        double Inches1, Inches2, Inches3;

        Inches = (Inches / COUNTS_PER_INCH);
        Inches1 = Inches + leftDriveB.getCurrentPosition();
        Inches2 = Inches + leftDriveF.getCurrentPosition();
        Inches3 = Inches + rightDriveF.getCurrentPosition();
        Inches += rightDriveB.getCurrentPosition();

        leftDriveB.setTargetPosition((int) Inches1);
        leftDriveF.setTargetPosition((int) Inches2);
        rightDriveF.setTargetPosition((int) Inches3);
        rightDriveB.setTargetPosition((int) Inches);

        leftDriveB.setPower(.5);
        leftDriveF.setPower(.5);
        rightDriveF.setPower(.5);
        rightDriveB.setPower(.5);

        leftDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    //..............................................................................................
    public static void BACKWARD(double Inches){
        double Inches1, Inches2, Inches3;

        Inches = ( Inches / COUNTS_PER_INCH);
        Inches1 = Inches + leftDriveB.getCurrentPosition();
        Inches2 = Inches + leftDriveF.getCurrentPosition();
        Inches3 = Inches + rightDriveF.getCurrentPosition();
        Inches += rightDriveB.getCurrentPosition();

        leftDriveB.setTargetPosition((int)Inches1);    leftDriveF.setTargetPosition((int)Inches2);
        rightDriveF.setTargetPosition((int)Inches3);    rightDriveB.setTargetPosition((int)Inches);

        leftDriveB.setPower(-.5);    leftDriveF.setPower(-.5);
        rightDriveF.setPower(-.5);   rightDriveB.setPower(-.5);

        leftDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    //...............................................................................................
    public static void StrafeToLeft(double Inches){
        double Inches1;

        Inches = ( Inches / COUNTS_PER_INCH);
        Inches1 = Inches + rightDriveF.getTargetPosition();
        Inches += leftDriveB.getTargetPosition();


        leftDriveB.setTargetPosition((int)Inches);
        rightDriveF.setTargetPosition((int)Inches1);

        leftDriveB.setPower(.5);
        rightDriveF.setPower(.5);

        leftDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    //...............................................................................................
    public static void StrafeToRight(double Inches){
        double Inches1;

        Inches = ( Inches / COUNTS_PER_INCH);
        Inches1 = Inches + rightDriveB.getTargetPosition();
        Inches += leftDriveF.getTargetPosition();

        leftDriveF.setTargetPosition((int)Inches);
        rightDriveB.setTargetPosition((int)Inches1);

        leftDriveF.setPower(.5);
        rightDriveB.setPower(.5);

        leftDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    //............................................................................................
    public static void StrafeToRightB(double Inches){
        double Inches1;

        Inches = ( Inches / COUNTS_PER_INCH);
        Inches1 = Inches + rightDriveF.getTargetPosition();
        Inches += leftDriveB.getTargetPosition();

        leftDriveB.setTargetPosition((int)Inches);
        rightDriveF.setTargetPosition((int)Inches1);

        leftDriveB.setPower(-.5);
        rightDriveF.setPower(-.5);

        leftDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    //...............................................................................................
    public static void StrafeToLeftB(double Inches){
        double Inches1;

        Inches = ( Inches / COUNTS_PER_INCH);
        Inches1 = Inches + rightDriveB.getTargetPosition();
        Inches += leftDriveF.getTargetPosition();

        leftDriveF.setTargetPosition((int)Inches);
        rightDriveB.setTargetPosition((int)Inches1);

        leftDriveF.setPower(-.5);
        rightDriveB.setPower(-.5);

        leftDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    //............................................................................................
    public static void StrafeRight(double Inches) {

        Inches = ( Inches / COUNTS_PER_INCH);
        Inches += leftDriveB.getTargetPosition();

        leftDriveB.setTargetPosition((int)Inches);    leftDriveF.setTargetPosition((int)Inches);
        rightDriveF.setTargetPosition((int)Inches);    rightDriveB.setTargetPosition((int)Inches);

        leftDriveB.setPower(-.5);    leftDriveF.setPower(.5);
        rightDriveF.setPower(-.5);   rightDriveB.setPower(.5);

        leftDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    //............................................................................................
    public static void StrafeLeft(double Inches) {

        Inches = ( Inches / COUNTS_PER_INCH);
        Inches += leftDriveB.getTargetPosition();

        leftDriveB.setTargetPosition((int)Inches);    leftDriveF.setTargetPosition((int)Inches);
        rightDriveF.setTargetPosition((int)Inches);    rightDriveB.setTargetPosition((int)Inches);

        leftDriveB.setPower(.5);    leftDriveF.setPower(-.5);
        rightDriveF.setPower(.5);   rightDriveB.setPower(-.5);

        leftDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    //............................................................................................
    public static void TurnRigth (double Inches) {

        Inches = ( Inches / COUNTS_PER_INCH);
        Inches += leftDriveB.getTargetPosition();

        leftDriveB.setTargetPosition((int)Inches);    leftDriveF.setTargetPosition((int)Inches);
        rightDriveF.setTargetPosition((int)Inches);    rightDriveB.setTargetPosition((int)Inches);

        leftDriveB.setPower(.5);    leftDriveF.setPower(.5);
        rightDriveF.setPower(-.5);   rightDriveB.setPower(-.5);

        leftDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
//..............................................................................................

    public static void TurnLeft (double Inches) {

        Inches = ( Inches / COUNTS_PER_INCH);
        Inches += leftDriveB.getTargetPosition();

        leftDriveB.setTargetPosition((int)Inches);    leftDriveF.setTargetPosition((int)Inches);
        rightDriveF.setTargetPosition((int)Inches);    rightDriveB.setTargetPosition((int)Inches);

        leftDriveB.setPower(-.5);    leftDriveF.setPower(-.5);
        rightDriveF.setPower(.5);   rightDriveB.setPower(.5);

        leftDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveF.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightDriveB.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    //.............................................................................................
    public static void ParateRobot(){
        leftDriveB.setPower(0);
        leftDriveF.setPower(0);
        rightDriveF.setPower(0);
        rightDriveB.setPower(0);

    }
}