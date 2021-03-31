package level1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateRange {

	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	
	public DateRange(LocalDateTime startDate, LocalDateTime endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDateTime();
	}
	
	
}
