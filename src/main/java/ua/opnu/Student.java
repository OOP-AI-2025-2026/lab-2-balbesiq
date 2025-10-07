package ua.opnu;

public class Student {
    String name;
    int year;
    String[] disciplines;
    int courseCount;

    Student(String name, int year){
        this.name = name;
        if(year>4 || year<1)
            this.year = 1;
        else
            this.year = year;
        this.disciplines = new String[20];
        this.courseCount=0;
    }

    void addCourse(String courseName){
        if((courseCount < disciplines.length) && (courseName != null)){
            disciplines[courseCount]=courseName;
            courseCount++;
        }
    }

    void dropAll(){
        for(int i=0; i<courseCount; i++){
            disciplines[i]=null;
        }
    }

    int getCourseCount(){
        return courseCount;
    }

    String getName(){
        return name;
    }

    int getTuition(){
        return (year*20000);
    }

    int getYear(){
        return year;
    }


}
