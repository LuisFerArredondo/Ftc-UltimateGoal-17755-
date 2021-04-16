package org.firstinspires.ftc.teamcode.RoadRunner.drive;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="FinalB_15600", group=" Trayectorias")
public class TargetZoneFinalB_15600 extends LinearOpMode {
    @Override
    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        Pose2d startPose = new Pose2d(-52, -26, Math.toRadians(0));

        Trajectory builder1 = drive.trajectoryBuilder(startPose)

                .splineToSplineHeading(new Pose2d(15.0, -29.0,Math.toRadians(0.0)), Math.toRadians(0.0))
                // .splineToSplineHeading(Pose2d(15.0, -29.0,160.0.ToRadians),0.0.ToRadians)
                .splineToSplineHeading(new Pose2d(-21.0, -37.0,Math.toRadians(0.0)), Math.toRadians(180.0))
                .back(5.0)
                /*.splineToSplineHeading(Pose2d(-36.0,-48.0,180.0.ToRadians),270.0.ToRadians)
                  .splineToSplineHeading(Pose2d(15.0, -44.0,359.0.ToRadians),0.0.ToRadians)
                */  .build();

        Trajectory builder2 = drive.trajectoryBuilder(builder1.end())
//            .splineToConstantHeading(Vector2d(-35.0,-48.0),0.0.ToRadians)
                .splineToLinearHeading(new Pose2d(-33.0,-48.0,Math.toRadians(180.0)),Math.toRadians(0.0))

                .build();

        Trajectory builder3 = drive.trajectoryBuilder(builder2.end())
                .lineToLinearHeading(new Pose2d(15.0, -44.0,Math.toRadians(359.0)))
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

