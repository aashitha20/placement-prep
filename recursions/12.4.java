//4. Banking — Recursive Transaction Dependency Resolver
void resolve(Transaction t, Set<Transaction> done, List<Transaction> order){
 if(done.contains(t)) return;

 for(Transaction dep : t.dependencies)
     resolve(dep, done, order);         // resolve dependencies first

 order.add(t);                          // then execute this transaction
 done.add(t);
}
