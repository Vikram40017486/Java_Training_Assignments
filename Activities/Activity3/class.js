class Student
{
       constructor(name,department)
       {
        this.name = name;
        this.department =department;
       }
       getDisplay()
       {
        console.log(`the name of student is ${this.name} and department is ${this.department} `)
       }
}

const STUDENT1 = new Student('Vikram','CSE')
const STUDENT2 = new Student('Ankit','IT');

STUDENT1.getDisplay();
STUDENT2.getDisplay();
