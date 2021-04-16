package org.firstinspires.ftc.teamcode.RoadRunner.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import static android.os.SystemClock.sleep;

public class Intake_Feeder_Shooter {
    double a;
  DcMotor Intake;
    DcMotor feeder;
    DcMotor shooter;
    DcMotor Wooble;
    Servo WoobleClaw;
    DistanceSensor sensorRange;

    public void HardwareMap(HardwareMap hardwareMap){
        Intake= hardwareMap.dcMotor.get("Intake");
        feeder= hardwareMap.dcMotor.get("Feeder");
        shooter= hardwareMap.dcMotor.get("Shooter");
        Wooble = hardwareMap.dcMotor.get("Wooble");
        WoobleClaw = hardwareMap.servo.get("WoobleClaw");
         sensorRange = hardwareMap.get(DistanceSensor.class, "sensor_range");
    }

  public void Wooble(String a){


        switch (a){
            case "up":
                break;
            case "down":
                break;

        }

  }

public void WoobleClaw(String c){
        switch (c){
            case"open":WoobleClaw.setPosition(0);
                break;
            case "close":WoobleClaw.setPosition(1);
                break;
        }
}
public void Reload(){
 a = sensorRange.getDistance(DistanceUnit.CM);
        if(a==5){
          feeder.setPower(1);
          sleep(3000);
        }else{
            feeder.setPower(0);

        }

}
public void Shooter(boolean all){

  }
}