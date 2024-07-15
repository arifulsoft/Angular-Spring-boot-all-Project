import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-findDoctor',
  templateUrl: './findDoctor.component.html',
  styleUrls: ['./findDoctor.component.css']
})
export class FindDoctorComponent implements OnInit {

  departments: string[] = [
    'Cardiology', 'Dermatology', 'Endocrinology', 'Gastroenterology',
    'Gynecology', 'Hematology', 'Neurology', 'Oncology',
    'Orthopedics', 'Pediatrics', 'Psychiatry', 'Radiology',
    'Rheumatology', 'Urology', 'Pulmonology'
  ];

  selectedDepartment: string = '';
  searchQuery: string = '';

  searchDoctor() {
    console.log('Searching for doctors in', this.selectedDepartment, 'department with query:', this.searchQuery);
    // Add your search logic here
  }
  constructor() { }

  ngOnInit() {
  }

}
