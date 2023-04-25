import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-registro')
export class VistaRegistro extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout style="width: 50%; flex-shrink: 0; height: 100%; flex-grow: 0; justify-content: center; align-items: center;">
  <img id="img" style="width: 90%; height: 90%; flex-shrink: 0;" src="icons/toktok2.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 50%; height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-text-field id="idNombre" style="flex-shrink: 0; flex-grow: 0; width: 80%;" label="Nombre"></vaadin-text-field>
  <vaadin-text-field id="idApellidos" style="width: 80%; flex-shrink: 0;" label="Apellidos"></vaadin-text-field>
  <vaadin-text-field id="idUsuario" style="width: 80%; flex-shrink: 0;" label="Usuario"></vaadin-text-field>
  <vaadin-text-field id="idContrasenna" style="width: 80%; flex-shrink: 0;" label="Contraseña"></vaadin-text-field>
  <vaadin-text-field id="idCorreo" style="width: 80%; flex-shrink: 0;" label="Correo"></vaadin-text-field>
  <vaadin-text-field id="idFechaNacimiento" style="width: 80%; flex-shrink: 0;" label="Fecha Nacimiento"></vaadin-text-field>
  <vaadin-text-field id="idDescripcion" style="width: 80%; flex-shrink: 0;" label="Descripción"></vaadin-text-field>
  <vaadin-horizontal-layout theme="spacing" style="width: 80%; align-items: center; justify-content: center; flex-shrink: 0;">
    Foto 
   <vaadin-upload id="idImagen" style="flex-shrink: 0;"></vaadin-upload>
  </vaadin-horizontal-layout>
  <vaadin-checkbox id="usrComBool" style="flex-shrink: 0;">
    Usuario Comercial 
  </vaadin-checkbox>
  <vaadin-button style="width: 80%; flex-shrink: 0;">
    Registrarse 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
