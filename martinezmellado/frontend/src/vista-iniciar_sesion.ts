import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-iniciar_sesion')
export class VistaIniciar_sesion extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; align-items: center; justify-content: center; position: absolute;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
  <img style="width: 90%; height: 90%; align-self: center;" src="icons/toktok2.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; align-self: center; justify-content: flex-end;">
  <label style="margin-top: 20%;">Bienvenido!</label>
  <vaadin-text-field id="inUser" style="flex-shrink: 0; flex-grow: 0; width: 60%; margin-top: 20%;" label="Usuario"></vaadin-text-field>
  <vaadin-password-field label="Contraseña" value="secret1" id="inPass" style="width: 60%;" has-value></vaadin-password-field>
  <vaadin-button id="bIniciarSesion" style="width: 60%; margin-top: 5%;">
    Iniciar sesion 
  </vaadin-button>
  <vaadin-button id="inicio" style="width: 60%;">
   Atras 
  </vaadin-button>
  <vaadin-vertical-layout style="width: 100%; flex-grow: 1; align-items: stretch; justify-content: flex-end;">
   <vaadin-horizontal-layout theme="spacing-xl" style="align-items: flex-end; padding: var(--lumo-space-xl);">
    <vaadin-button style="flex-grow: 0; flex-shrink: 0; height: 100%;" id="bRecuperarContrasenna">
      Recuperar contraseña 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
