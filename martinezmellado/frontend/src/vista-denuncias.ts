import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import './vista-denuncias_item';

@customElement('vista-denuncias')
export class VistaDenuncias extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera__administrador_ style="width: 100%; height: 5%;"></vista-cabecera__administrador_>
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 5%; align-self: center; align-items: center; justify-content: center;">
  <vaadin-button style="width: 20%;">
   Todas
  </vaadin-button>
  <vaadin-button style="width: 20%;">
   Pendientes
  </vaadin-button>
  <vaadin-button style="width: 20%;">
   Vistas 
  </vaadin-button>
  <vaadin-button style="width: 20%;">
   Aplicadas 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-scroller style="width: 100%; height: 100%;">
  <vista-denuncias_item style="width: 100%; height: 20%; margin: var(--lumo-space-s);"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%; margin: var(--lumo-space-s);"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%; margin: var(--lumo-space-s);"></vista-denuncias_item>
  <vista-denuncias_item style="height: 20%; margin: var(--lumo-space-s);"></vista-denuncias_item>
 </vaadin-scroller>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
