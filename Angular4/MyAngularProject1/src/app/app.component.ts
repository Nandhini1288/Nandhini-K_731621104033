import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
 flag:boolean;
 vehicles:string[];
 selectedvehicle:string;
 myStyle:{};
 myClass: string;

  constructor(){
    this.flag=true;
    this.vehicles=["Twowheeler","Threewheeler","Fourwheeler"];
    this.selectedvehicle=" ";
    this.myStyle={'height':'180px','width':'40%','border':'2px solid green','background-color':'pink'};
    this.myClass="MyClass1";
  }

  changeFlag(){
    this.flag=! this.flag;
  }

  setSelectedItem(vec:string){
      this.selectedvehicle=vec;
  }
  changeStyle(){
    this.myStyle={'height':'180px','width':'40%','border':'2px solid pink','background-color':'pink'};

  }
}