//5.2 Naïve substring search (text + pattern), return starting index
String text = "we prepare students for placement exams";
String pattern = "placement";
int n = text.length(), m = pattern.length();
int found = -1;
for (int i = 0; i <= n - m; i++) {
    int j;
    for (j = 0; j < m; j++) {
        if (text.charAt(i + j) != pattern.charAt(j)) break;
    }
    if (j == m) { found = i; break; }
}
System.out.println(found == -1 ? "Not found" : "Found at " + found);
