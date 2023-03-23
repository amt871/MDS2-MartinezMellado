import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-recuperar_contrasenna')
export class VistaRecuperar_contrasenna extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 30%; align-items: center; justify-content: center;">
  <img style="align-self: center;" src="../../resources/icons/toktok2.svg">
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%; justify-content: center; align-items: center;">
  Introduzca su correo electronico, le enviaremos un codigo de seguridad.
  <vaadin-text-field id="idCorreo" style="width: 70%;"></vaadin-text-field>
  <vaadin-button id="idBoton" style="width: 20%;">
   Enviar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
