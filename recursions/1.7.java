//2. Recursive Compound Growth With Varying Rates
double value(double principal, double[] rate, int year){
 if(year==0) return principal;
 return value(principal*(1+rate[year-1]), rate, year-1);
}
