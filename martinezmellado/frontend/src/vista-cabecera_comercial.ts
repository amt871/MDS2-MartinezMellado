import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';

@customElement('vista-cabecera_comercial')
export class VistaCabecera_comercial extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: flex-end; align-items: center; justify-content: flex-end; margin-right: var(--lumo-space-s);">
  <vaadin-button>
   Perfil
  </vaadin-button>
  <vaadin-button>
   Publicar
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton">
   <iron-icon icon="vaadin:sign-out"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
