package org.firstinspires.ftc.teamcode.RoadRunner.drive;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="FinalA_15600", group=" Trayectorias")
public class TargetZoneFinalA_15600 extends LinearOpMode {
    @Override
    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        Pose2d startPose = new Pose2d(-52, -26, Math.toRadians(0));

        Trajectory builder1 = drive.trajectoryBuilder(startPose)
                .splineToLinearHeading(new Pose2d(0.0,-52.0,Math.toRadians(350.0)),Math.toRadians(0.0))
                .build();

        Trajectory builder2 = drive.trajectoryBuilder(builder1.end())
                .splineToLinearHeading(new Pose2d(-33.0,-48.0,Math.toRadians(181.0)),Math.toRadians(180.0))
                .build();

        Trajectory builder3 = drive.trajectoryBuilder(builder2.end())
                //  .splineToLinearHeading(Pose2d(-5.0,-62.0,0.0.ToRadians),0.0.ToRadians)
                .splineToLinearHeading(new Pose2d(-5.0,-62.0), Math.toRadians(270.0))
                .build();
        waitForStart();

        if(isStopRequested()) return;
        drive.setPoseEstimate(startPose);
        drive.turn(Math.toRadians(10.0));



        drive.followTrajectory(builder1);
        telemetry.addData(">","deja el wobble");
        telemetry.update();
        drive.followTrajectory(builder2);
        telemetry.addData(">","lo recoge");
        telemetry.update();
        drive.followTrajectory(builder3);
        telemetry.addData(">","lo deja");
        telemetry.update();

    }

}
