import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; justify-content: space-between; background-color: #d8d8d8; position: relative;">
 <vaadin-vertical-layout style="align-items: center; height: 100%; justify-content: center; flex-shrink: 0; width: 20%;">
  <img style="max-width: 50%; max-height: 100%;" id="imagen">
  <label id="texto">Objeto Denunciado</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 100%; align-self: center; align-items: center; justify-content: center;">
  <label id="textoDescripcion">Label</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="align-items: center; justify-content: center; flex-grow: 0; flex-shrink: 1; width: 20%; height: 100%;">
  <vaadin-button style="width: 100%;" id="bAceptar">
    Aceptar 
  </vaadin-button>
  <vaadin-button style="width: 100%;" id="bRechazar">
    Rechazar 
  </vaadin-button>
  <vaadin-button style="width: 100%;" id="bPosponer">
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
