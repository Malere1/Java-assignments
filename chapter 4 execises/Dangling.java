4.27 — Dangling-else Problem (Fixed)

Add braces to force the else to belong to the outer if :
if (x > 5) {
if (y > 5)
System.out.println("x and y are > 5");
}
else
System.out.println("x is <= 5");
