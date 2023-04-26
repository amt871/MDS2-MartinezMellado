import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-denuncias_item')
export class VistaDenuncias_item extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; justify-content: space-between; background-color: #d8d8d8;">
 <vaadin-vertical-layout style="align-items: center; height: 100%; justify-content: center; flex-shrink: 0;">
  <img style="height: 30%; width: 30%;" src="icons/java.svg">
  <label>Objeto Denunciado</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="flex-grow: 0; justify-content: center; width: 20%; flex-shrink: 1; align-items: center; height: 100%; align-self: center;">
  <label style="align-self: center;">Fecha de la denuncia</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="align-items: center; justify-content: center; flex-grow: 0; flex-shrink: 1; width: 40%; height: 100%;">
  <vaadin-button style="width: 100%;">
    Aceptar 
  </vaadin-button>
  <vaadin-button style="width: 100%;">
    Rechazar 
  </vaadin-button>
  <vaadin-button style="width: 100%;">
    Posponer 
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
