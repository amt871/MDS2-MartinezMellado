import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-confirmar_correo')
export class VistaConfirmar_correo extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout style="width: 100%; height: 30%; align-items: center; justify-content: center;">
  <img src="icons/toktok2.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 70%; align-items: center; justify-content: center;">
  <label>Introduzca el codigo que le hemos enviado </label>
  <vaadin-text-field label="" placeholder="" style="width: 70%;" id="bTextField"></vaadin-text-field>
  <vaadin-button style="width: 20%;" id="bEnviar">
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
