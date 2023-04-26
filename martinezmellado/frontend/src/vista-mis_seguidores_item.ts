import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-mis_seguidores_item')
export class VistaMis_seguidores_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 20%; justify-content: center; align-items: center;">
 <vaadin-horizontal-layout theme="" style="width: 100%; height: 100%; justify-content: center; align-items: center;">
  <img style="width: 20%; height: 100%;" src="icons/user.svg">
  <vaadin-vertical-layout style="width: 20%; height: 100%; justify-content: center; padding-bottom: var(--lumo-space-xl); padding-top: var(--lumo-space-xl);" theme="spacing-xl">
   <label>Usuario </label>
   <label>Seguidores</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 60%; height: 100%; padding-right: var(--lumo-space-m); justify-content: center; align-items: flex-end;">
   <vaadin-button style="width: 20%;">
     Seguir 
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
