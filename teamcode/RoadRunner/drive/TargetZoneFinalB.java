package org.firstinspires.ftc.teamcode.RoadRunner.drive;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="FinalB", group=" Trayectorias")
public class TargetZoneFinalB extends LinearOpMode {
    @Override
    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);
        Pose2d startPose = new Pose2d(-52, -26, Math.toRadians(360));
        Trajectory builder1 = drive.trajectoryBuilder(startPose)

                .splineToSplineHeading(new Pose2d(15.0, -29.0,Math.toRadians(90.0)),Math.toRadians(0.0))
                // .splineToSplineHeading(Pose2d(15.0, -29.0,160.0.ToRadians),0.0.ToRadians)
                .splineToSplineHeading(new Pose2d(-21.0, -37.0, Math.toRadians(0.0)),Math.toRadians(180.0))
                .back(5.0)
                .splineToSplineHeading(new Pose2d(-36.0,-48.0,Math.toRadians(270.0)), Math.toRadians(270.0))
                .splineToSplineHeading(new Pose2d(15.0, -44.0,Math.toRadians(99.0)),Math.toRadians(0.0))
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

        drive.followTrajectory(builder1);
        telemetry.addData("deja el wooble","");
        telemetry.update();
    }

}
