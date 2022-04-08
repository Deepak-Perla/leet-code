class Solution {
    private static final int[] DAYS_IN_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
private static final String[] DAYS = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};

public String dayOfTheWeek(int day, int month, int year) {
	var days = day - 1;
	if (isLeapYear(year) && month > 2)
		days++;

	for (var y = 1971; y < year; y++)
		days += isLeapYear(y) ? 366 : 365;

	for (var m = 1; m < month; m++)
		days += DAYS_IN_MONTH[m];

	return DAYS[days % 7];
}

private boolean isLeapYear(int year) {
	if (year % 100 == 0)
		return year % 400 == 0;
	return year % 4 == 0;
}

}