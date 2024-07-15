export class CarTransactionTable {
  serial_no: any;
  car_name: any;
  car_number: any;
  from: any;
  to: any;
  booking_date: any;
  return_date: any;
  total_rent: any;
  customer_name: any;
  customer_nid: any;
  customer_mobile_no: any;
  total_days: any;
  advance_payment: any;
  constructor(
    serial_no: any,
    car_name: any,
    car_number: any,
    from: any,
    to: any,
    booking_date: any,
    return_date: any,
    total_rent: any,
    customer_nid: any,
    customer_mobile_no: any,
    customer_name: any,
    total_days: any,
    advance_payment: any
  ) {
    this.serial_no = serial_no;
    this.car_name = car_name;
    this.car_number = car_number;
    this.from = from;
    this.to = to;
    this.booking_date = booking_date;
    this.return_date = return_date;
    this.total_rent = total_rent;
    this.customer_nid = customer_nid;
    this.customer_mobile_no = customer_mobile_no;
    this.customer_name = customer_name;
    this.total_days = total_days;
    this.advance_payment = advance_payment;
  }
}
