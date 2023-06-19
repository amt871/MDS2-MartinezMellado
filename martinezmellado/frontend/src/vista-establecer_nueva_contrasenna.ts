import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-establecer_nueva_contrasenna')
export class VistaEstablecer_nueva_contrasenna extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;position: absolute;">
 <vaadin-horizontal-layout theme="spacing" style="height: 20%; width: 100%; align-items: center; justify-content: center;">
  <img src="icons/toktok2.svg">
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; width: 100%; height: 100%;">
   Nueva contraseña 
  <vaadin-text-field id="idPass1" style="width: 70%;"></vaadin-text-field>Confirma contraseña 
  <vaadin-text-field id="idPass2" style="width: 70%;"></vaadin-text-field>
  <vaadin-button id="idBoton" style="width: 20%;">
    Aceptar 
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
