export class Carbooking {
  nid: any;
  name: any;
  m_number: any;
  from: any;
  to: any;
  car_name: any;
  car_number: any;
  car_seating: any;
  rent_per_day: any;
  total_day: any;
  amount: any;
  booking_date: any;
  return_date: any;
  advance_payment: any;
  due: any;
  constructor(
    nid:any,
    name: any,
    m_number: any,
    from: any,
    to: any,
    car_name: any,
    car_number: any,
    car_seating: any,
    rent_per_day: any,
    total_day: any,
    amount: any,
    booking_date: any,
    return_date: any,
    advance_payment: any,
    due: any
  ) {
    this.nid = nid;
    this.name = name;
    this.m_number = m_number;
    this.from = from;
    this.to = to;
    this.car_name = car_name;
    this.car_number = car_number;
    this.car_seating = car_seating;
    this.rent_per_day = rent_per_day;
    this.total_day = total_day;
    this.amount = amount;
    this.booking_date = booking_date;
    this.return_date = return_date;
    this.advance_payment = advance_payment;
    this.due = due;
  }
}
