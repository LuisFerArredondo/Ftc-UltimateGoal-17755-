package org.firstinspires.ftc.teamcode.RoadRunner.drive;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="FinalC", group=" Trayectorias")
public class TargetZoneFinalC extends LinearOpMode {
    @Override
    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        Pose2d startPose = new Pose2d(-52, -26, Math.toRadians(0));

        Trajectory builder1 = drive.trajectoryBuilder(startPose)
                .lineTo(new Vector2d(-14.0, -39.0))
                .build();

        Trajectory builder2 = drive.trajectoryBuilder(builder1.end())
                .forward(3.0)
                .build();

        Trajectory builder3 = drive.trajectoryBuilder(builder2.end())
                .splineToLinearHeading(new Pose2d(42.0,-62.0,Math.toRadians(90.0)),Math.toRadians(0.0))
                .build();

        Trajectory builder4 = drive.trajectoryBuilder(builder3.end(),false)
                .splineToSplineHeading(new Pose2d(-10.0,-43.0, Math.toRadians(1.0)), Math.toRadians(180.0))
                .splineToSplineHeading(new Pose2d(-35.0,-48.0,Math.toRadians(270)),Math.toRadians(180.0))
                .build();

        Trajectory builder5 = drive.trajectoryBuilder(builder4.end(),false)
                .lineToSplineHeading(new Pose2d(40.0,-61.0,Math.toRadians(80.0)))
                .build();

        Trajectory builder6 = drive.trajectoryBuilder(builder5.end(),false)
                //  .splineToLinearHeading(Pose2d(42.0,-64.0,90.0.ToRadians),0.0.ToRadians)
                .build();

        waitForStart();

        if(isStopRequested()) return;
        drive.setPoseEstimate(startPose);
        drive.turn(Math.toRadians(2.0));
        //aqui dispara
        drive.turn(Math.toRadians(3.0));
        //aqui dispara
        drive.turn(Math.toRadians(5.0));
        //aqui dispara
        drive.turn(Math.toRadians(143.0));

        drive.followTrajectory(builder1);
        telemetry.addData("deja el wooble","");
        telemetry.update();

        drive.followTrajectory(builder2);
        telemetry.addData("deja segundo wobble","");
        telemetry.update();

        drive.followTrajectory(builder3);
        telemetry.addData("deja segundo wobble","");
        telemetry.update();

        drive.followTrajectory(builder4);
        telemetry.addData("","");
        telemetry.update();

        drive.followTrajectory(builder5);
        telemetry.addData("deja segundo wobble","");
        telemetry.update();

    }

}
