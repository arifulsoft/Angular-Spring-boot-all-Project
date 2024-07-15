export class Prescription {
    p_id: any;
    p_name: any;
    age: any;
    d_name: any;
    problem: any;
    prescription: any;
    advice: any;
    dep_name: any;

    constructor(p_id: any, p_name: any, age: any, d_name: any, problem: any, prescription: any, advice: any, dep_name: any) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.age = age;
        this.d_name = d_name;
        this.problem = problem;
        this.prescription = prescription;
        this.advice = advice;
        this.dep_name = dep_name;
    }
}
