//1. Recursive Validation of Nested Form Sections
boolean validate(Form f){
 if(!f.fieldIsValid()) return false;
 for(Form sub : f.children)
     if(!validate(sub)) return false;
 return true;
}
