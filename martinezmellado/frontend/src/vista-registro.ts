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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout style="width: 100%; justify-content: center;">
  <img id="img" style="width: 100%; height: 100%; margin: var(--lumo-space-m);" src="../../resources/icons/toktok2.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; justify-content: center; align-items: center; height: 100%; align-self: center;">
  <vaadin-text-field id="idNombre" style="flex-shrink: 1; flex-grow: 0; width: 80%;" label="Nombre"></vaadin-text-field>
  <vaadin-text-field id="idApellidos" style="width: 80%;" label="Apellidos"></vaadin-text-field>
  <vaadin-text-field id="idUsuario" style="width: 80%;" label="Usuario"></vaadin-text-field>
  <vaadin-text-field id="idContrasenna" style="width: 80%;" label="Contraseña"></vaadin-text-field>
  <vaadin-text-field id="idCorreo" style="width: 80%;" label="Correo"></vaadin-text-field>
  <vaadin-text-field id="idFechaNacimiento" style="width: 80%;" label="Fecha Nacimiento"></vaadin-text-field>
  <vaadin-text-field id="idDescripcion" style="width: 80%;" label="Descripción"></vaadin-text-field>
  <vaadin-horizontal-layout theme="spacing" style="width: 80%; align-self: center; align-items: center; justify-content: center;">
    Foto 
   <vaadin-upload id="idImagen"></vaadin-upload>
  </vaadin-horizontal-layout>
  <vaadin-checkbox id="usrComBool">
    Usuario Comercial 
  </vaadin-checkbox>
  <vaadin-button style="width: 80%;">
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
