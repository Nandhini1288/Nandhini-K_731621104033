import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
 //flag:boolean;
 //vehicles:string[];
 //selectedvehicle:string;
 //myStyle:{};
 //myClass: string;
 sum :number;
 sub: number;
  constructor(private calc : CalculatorService){
   // this.flag=true;
   // this.vehicles=["Twowheeler","Threewheeler","Fourwheeler"];
    //this.selectedvehicle=" ";
   // this.myStyle={'height':'180px','width':'40%','border':'2px solid green','background-color':'pink'};
   // this.myClass="MyClass1";
   this.sum=calc.getAddition(10,20);
   this.sub=calc.getSubraction(10,20);
  }
}
  //changeFlag(){
    //this.flag=! this.flag;
  //}

 // setSelectedItem(vec:string){
      //this.selectedvehicle=vec;
  //}
  //changeStyle(){
   // this.myStyle={'height':'180px','width':'40%','border':'2px solid pink','background-color':'pink'};

 
