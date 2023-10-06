package org.firstinspires.ftc.teamcode.testrepositor;

import com.qualcomm.robotcore.hardware.DcMotor;

public class hRDWARE {
    public DcMotor demoWheel1;
    public DcMotor demowheel2;
    public DcMotor demowheel3;
    public DcMotor demowheel4;


    public static double maxSpeed=1;

    private static Hardware myInstance=null;

    public static Hardware getInstance(){
        if (myInstance==null){
            myInstance=new Hardware();
        }
        return myInstance;
    }

    public DcMotor getDemoWheel1() {
    }

    blic void init(HardwareMap hwMap) {

        try {
            demoWheel1=hwMap.get(DcMotor.class, "demoWheel1");
            demoWheel1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            demoWheel1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            demoWheel1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }


    }




}