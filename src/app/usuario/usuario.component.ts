import { Component, OnInit } from "@angular/core";


@Component({
  selector: "app-usuario",
  templateUrl: "./usuario.component.html",
  styleUrls: ["./usuario.component.css"]
})
export class UsuarioComponent implements OnInit {

  public usuarioActivo: boolean;
  public password:String = "password";
  public edadUsuario:Number = 20;

  constructor() {}


  ngOnInit() {}


  activarUsuario(): void {
    this.usuarioActivo = true;
  }


  upperCaseStr(str): String {
   let upperString = str.toUpperCase();

   return upperString;
  }

}