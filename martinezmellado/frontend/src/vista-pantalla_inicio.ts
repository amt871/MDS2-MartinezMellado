import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-pantalla_inicio')
export class VistaPantalla_inicio extends LitElement {
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
<vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: center; align-items: center; position: absolute;">
 <vaadin-vertical-layout style="width: 50%; height: 100%; flex-shrink: 0; align-items: center; justify-content: center; flex-grow: 0;">
  <img id="img" style="width: 90%; flex-shrink: 0; flex-grow: 0; height: 90%;" src="icons/toktok2.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 50%; flex-shrink: 0; flex-grow: 0; height: 100%; align-items: center; justify-content: center;">
  <vaadin-button style="flex-shrink: 0; width: 60%; flex-grow: 0;" id="bRegistrarse">
    Registrarse 
  </vaadin-button>
  <vaadin-button style="flex-shrink: 0; width: 60%; flex-grow: 0;" id="bIniciarSesion">
    Iniciar Sesión 
  </vaadin-button>
  <vaadin-button style="flex-shrink: 0; width: 60%; flex-grow: 0;" id="bAcceder">
    Acceder 
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
