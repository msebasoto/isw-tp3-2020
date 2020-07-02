import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UsuarioComponent } from './usuario.component';

describe('UsuarioComponent', () => {
  let component: UsuarioComponent;
  let fixture: ComponentFixture<UsuarioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UsuarioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsuarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });



it('debe  comenzar con el usuario desactivado' , () => {
  expect(component.usuarioActivo).toBeFalsy();
});


it('debe activar el usuario', () => {
  component.activarUsuario();
  expect(component.usuarioActivo).toBeTruthy();
});


it('Comprueba que la contraseña no sea nula', () => {
  expect(component.password) !== null;
});

it('Comprueba que la contraseña sea string', () => {
  expect(typeof component.password).toEqual('string');
});

it('Comprueba que la edad sea un número', () => {
  expect(typeof component.edadUsuario).toEqual('number');
});


it('Comprueba que la función upperCaseStr devuelva el texto pasado por parámetro en mayúsculas', () => {
  expect(component.upperCaseStr('prueba')).toEqual('PRUEBA');
});

});