import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from './app.component';
import { By } from '@angular/platform-browser';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  }));

  it('Debería crear la app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  //Se espera que se cree bien la aplicación

  it(`Debería tener el título 'pruebasUnitarias'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('pruebasUnitarias');
  });
  //Se espera que la variable title tenga un string con 'pruebasUnitarias'

  it('Debería renderizar el titulo', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('.content span').textContent).toContain('pruebasUnitarias app is running!');
  });
  //Se espera que se renderice bien el titulo en el HTML
  //junto con un texto extra que lo definimos en el mismo HTML

  it(`Debería setear submitted un true`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.onSubmit();
    expect(app.submitted).toBeTruthy();
  });

  //The test espera que la propiedad del componente "enviado"
  //sea verdadera cuando se llama a la función "onSubmit"

  it(`Debería llamar al método onSubmit`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    fixture.detectChanges();
    spyOn(app, "onSubmit");
    let elem = fixture.debugElement.query(By.css("button")).nativeElement;
    elem.click();
    expect(app.onSubmit).toHaveBeenCalledTimes(0);
  });

  //Aplica el estado del componente al HTML
  // con la función "detectChanges" del objeto "fixture",
  // luego obtiene el botón de envío del DOM y activa el evento click.
  // Antes de todo esto, creamos un "espía" de jazmín en la función "onSubmit" del componente.
  // Finalmente, esperamos que la función espiada no se ejecute,
  // porque el botón debe estar deshabilitado ya que el formulario no es válido.

  it(`El control 'nombre' debería ser invalido`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.contactForm.controls["nombre"].setValue("");
    expect(app.contactForm.controls["nombre"].valid).toBeFalsy();
  });
  //Se espera que el validador nombre sea invalido porque no se ingresa nada

  it(`El control 'nombre' debería ser valido `, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.contactForm.controls["nombre"].setValue("1234");
    expect(app.contactForm.controls["nombre"].valid).toBeTruthy();
  });
  //Se espera que el validador nombre sea valido

  it(`El control 'email' debería ser invalido`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.contactForm.controls["email"].setValue("");
    expect(app.contactForm.controls["email"].valid).toBeFalsy();
  });
  //Se espera que el validador email sea invalido porque no se le ingreso ningun valor

  it(`El control 'email' debería ser invalido por falta de formato`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.contactForm.controls["email"].setValue("prueba");
    expect(app.contactForm.controls["email"].valid).toBeFalsy();
  });
  //Se espera que el validador email sea invalido porque no se le ingreso un formato de email

  it(`El control 'email' debería ser valido`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.contactForm.controls["email"].setValue("prueba@gmail.com");
    expect(app.contactForm.controls["email"].valid).toBeTruthy();
  });
  //Se espera que el validador email sea valido



});
