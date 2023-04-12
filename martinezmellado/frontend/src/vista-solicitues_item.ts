import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-solicitues_item')
export class VistaSolicitues_item extends LitElement {
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
 <vaadin-horizontal-layout theme="" style="width: 100%; height: 100%; align-items: center;">
  <img style="width: 20%; height: 100%;" src="../../resources/icons/user.svg">
  <vaadin-vertical-layout style="justify-content: space-between; padding-top: var(--lumo-space-xl); padding-bottom: var(--lumo-space-xl); height: 100%; width: 20%;">
   <label>Usuario</label>
   <label>Seguidores</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 60%; align-items: flex-end; padding-right: var(--lumo-space-m); justify-content: center;">
   <vaadin-button style="width: 20%;">
    Aceptar
   </vaadin-button>
   <vaadin-button style="width: 20%;">
    Eliminar
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
