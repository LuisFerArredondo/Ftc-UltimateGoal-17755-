package org.firstinspires.ftc.teamcode.RoadRunner.drive;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="FinalC_15600", group=" Trayectorias")
public class TargetZoneFinalC_15600 extends LinearOpMode {
    @Override
    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        Pose2d startPose = new Pose2d(-52, -26, Math.toRadians(0));

        Trajectory builder1 = drive.trajectoryBuilder(startPose,false)
                .splineToConstantHeading(new Vector2d(-5.0,-38.0),Math.toRadians(270.0))
                .build();

        Trajectory builder2 = drive.trajectoryBuilder(builder1.end())
                .back(30.0)
                .build();

        Trajectory builder3 = drive.trajectoryBuilder(builder2.end(),true)
                .back(7.0)
                .build();

        Trajectory builder4 = drive.trajectoryBuilder(builder3.end(),false)
                .splineToConstantHeading(new Vector2d(42.0,-57.0),Math.toRadians(0.0))
                .build();

        Trajectory builder5 = drive.trajectoryBuilder(builder4.end(), true)
                .splineToLinearHeading(new Pose2d(-35.0,-48.0,Math.toRadians(180.0)),Math.toRadians(180.0))
                .build();

        Trajectory builder6 = drive.trajectoryBuilder(builder5.end(),true)
                .splineToSplineHeading(new Pose2d(40.0,-60.0,Math.toRadians(0.0)),Math.toRadians(1.0))
                .build();

        waitForStart();

        if(isStopRequested()) return;
        drive.setPoseEstimate(startPose);
        drive.turn(Math.toRadians(0.0));



        drive.followTrajectory(builder1);
        telemetry.addData(">","deja el wobble");
        telemetry.update();
        drive.followTrajectory(builder2);
        telemetry.addData(">","lo recoge");
        telemetry.update();
        drive.followTrajectory(builder3);
        telemetry.addData(">","");
        telemetry.update();

        drive.followTrajectory(builder4);
        telemetry.addData(">","");
        telemetry.update();

        drive.followTrajectory(builder5);
        telemetry.addData(">","");
        telemetry.update();

        drive.followTrajectory(builder6);
        telemetry.addData(">","");
        telemetry.update();

    }

}
