import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-horizontal-layout style="width: 100%; height: 100%; flex-direction: row; padding: var(--lumo-space-m); align-items: center; justify-content: center;" id="layoutPrincipal">
 <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; justify-content: center; align-items: center; align-self: center;">
  <img id="img" style="width: 90%; height: 90%; margin: var(--lumo-space-m);" src="icons/toktok2.svg">
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 100%; align-items: center; justify-content: center; flex-shrink: 0; align-self: center;">
  <vaadin-button style="width: 60%;" id="bRegistrarse">
    Registrarse 
  </vaadin-button>
  <vaadin-button style="width: 60%;" id="bIniciarSesion">
    Iniciar Sesión 
  </vaadin-button>
  <vaadin-button style="width: 60%;" id="bAcceder">
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
