//6.6 Check leap year (nested if)
int year = 2024;
boolean isLeap;
if (year % 4 == 0) {
    if (year % 100 == 0) {
        isLeap = (year % 400 == 0);
    } else isLeap = true;
} else isLeap = false;
System.out.println(isLeap ? "Leap year" : "Not a leap year");
