import java.time.LocalDateTime
import java.time.LocalDate


class Gigasecond// TODO: Implement proper constructor
    (localDate: Any) {

    private val startDate: LocalDateTime = if (localDate is LocalDate) localDate.atStartOfDay() else localDate as LocalDateTime
    val date: LocalDateTime = startDate.plusSeconds(1000000000)
}
