export class Doctor {
    d_id: any;
    d_name:any;
    age: any;
    gender: any;
    specialization: any;
    experience: any;
    mobile: any;
    email: any;
    schedule: any;
    dep_id: any;
    dep_name: any;
    c_fee: any;
    image: any;

    constructor(d_id: any, d_name:any, age: any, gender: any, specialization: any, experience: any,
        mobile: any, email: any, schedule: any, dep_id: any, dep_name: any, c_fee: any, image: any) {

        this.d_id = d_id;
        this.d_name=d_name;
        this.age = age;
        this.gender = gender;
        this.specialization = specialization;
        this.experience = experience;
        this.mobile = mobile;
        this.email = email;
        this.schedule = schedule;
        this.dep_id = dep_id;
        this.dep_name = dep_name;
        this.c_fee = c_fee;
        this.image = image;
    }
}