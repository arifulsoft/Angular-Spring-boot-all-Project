export class ApprovalTable {
  nid: any;
  name: any;
  mobile_number: any;
  from: any;
  to: any;
  car_number: any;
  booking_date: any;
  total_day: any;
  total_rent: any;
  due_rent: any;
  status: any;

  constructor( nid: any,
    name: any,
    mobile_number: any,
    from: any,
    to: any,
    car_number: any,
    booking_date: any,
    total_day: any,
    total_rent: any,
    due_rent: any,
    status: any) {

this.nid=nid;
this.name=name;
this.mobile_number=mobile_number;
this.from=from;
this.to=to;
this.car_number=car_number;
this.booking_date=booking_date;
this.total_day=total_day;
this.total_rent=total_rent;
this.due_rent=due_rent;
this.status=status;

  }
}
