package epl362Project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Appointment {
	private Date Date;
	private Boolean missed;


	/**
	 * Instantiates a new appointment.
	 *
	 * @param date the Appointment date
	 * @param missed If the patient missed the appointment
	 */
	public Appointment(String date, Boolean missed)
	{
		this.setDate(converter(date));
		this.setMissed(missed);
	}
	/**
	 * Converts the Date string into Date object
	 *
	 * @param appointment the appointment in string format
	 * @return the date in Date object format
	 */
	private static Date converter(String appointment)
	{
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy 'at' HH:mm"); 

		Date startDate;
		try {

			startDate = df.parse(appointment);

			return startDate;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * Gets the missed.
	 *
	 * @return the missed
	 */
	public Boolean getMissed() {
		return missed;
	}

	/**
	 * Sets the missed.
	 *
	 * @param missed the new missed
	 */
	public void setMissed(Boolean missed) {
		this.missed = missed;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return Date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Date date) {
		Date = date;
	}

}
