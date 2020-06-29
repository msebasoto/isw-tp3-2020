import { Component } from '@angular/core';
import {FormControl,FormGroup,Validators} from "@angular/forms"
import { ViewportScroller } from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pruebasUnitarias';
  submitted:boolean=false;
  contactForm:FormGroup;
  contact={
    nombre: "",
    apellido: "",
    email: ""
  };


  constructor(){
this.createForm();
  }

createForm():void{
this.contactForm= new FormGroup({
  "nombre": new FormControl(this.contact.nombre,[Validators.required,Validators.min(4)]),
  "apellido": new FormControl(this.contact.apellido,[Validators.required,Validators.min(4)]),
  "email": new FormControl(this.contact.email,[Validators.required,Validators.email]),
});
}


onSubmit():void{
  this.submitted=true;
}








}
