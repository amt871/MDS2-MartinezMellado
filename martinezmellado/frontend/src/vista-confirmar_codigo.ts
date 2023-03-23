import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-confirmar_codigo')
export class VistaConfirmar_codigo extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; height: 30%; width: 100%;">
  <img src="../../resources/icons/toktok2.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%; align-items: center; justify-content: center;">
  Introduzca el codigo que le hemos enviado
  <vaadin-text-field id="idCodigo" style="width: 70%;"></vaadin-text-field>
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
