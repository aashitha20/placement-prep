//5.1 Linear search for character ("PLACEMENTPREPARATION", find 'E')
String s = "PLACEMENTPREPARATION";
char target = 'E';
int idx = -1;
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == target) { idx = i; break; }
}
System.out.println(idx == -1 ? "Character not found" : "Index " + idx);

