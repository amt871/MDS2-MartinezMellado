import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-iniciar_sesion__administrador_')
export class VistaIniciar_sesion__administrador_ extends LitElement {
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
<vaadin-horizontal-layout class="content" style="align-items: center; justify-content: center; width: 100%; height: 100%; position: absolute;">
 <vaadin-vertical-layout style="width: 50%; height: 100%; align-items: center; justify-content: center; flex-shrink: 0;">
  <img style="width: 90%; height: 90%;" src="icons/toktok2.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; align-items: center; flex-shrink: 0;">
  <label id="LabelUsuario" style="margin-top: 20%;">Administrador </label>
  <vaadin-text-field label="Usuario" id="inUser" style="flex-shrink: 0; flex-grow: 0; width: 60%; margin-top: 20%;"></vaadin-text-field>
  <vaadin-password-field label="Contraseña" value="secret1" id="inPass" style="width: 60%;" has-value></vaadin-password-field>
  <vaadin-button id="bIniciarSesion" style="width: 60%; margin-top: 5%;">
    Iniciar sesion 
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
