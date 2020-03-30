package com.syntax.class19;

public class MainTeacher  {

	public static void main(String[] args) {
		MathTeacher mt = new MathTeacher ();
		mt.hasGlasses=true;
		MathTeacher.ability();
        mt.hasStudents=true;
        mt.subject="Math";
        System.out.println(mt.subject+" has glasses "+mt.hasGlasses);
        
        PianoTeacher pt =new PianoTeacher();
        pt.hasPiano=10;
        pt.hasStudents=true;
        pt.teacherNickName="Pi";
        PianoTeacher.talent();
        System.out.println(pt.teacherNickName+" has "+pt.hasPiano+" pianos.");
        
        ChemistryTeacher ct =new ChemistryTeacher ();
        ct.teacherName ="Ariel";
        ct.likeChemistry=true;
        ChemistryTeacher.skills();
        System.out.println(ct.teacherName+" likes Chemistry ? : "+ct.likeChemistry);
	}

}
