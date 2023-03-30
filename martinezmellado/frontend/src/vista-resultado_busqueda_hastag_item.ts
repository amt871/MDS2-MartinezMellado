import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-resultado_busqueda_hastag_item')
export class VistaResultado_busqueda_hastag_item extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
 <vaadin-horizontal-layout class="content" style="justify-content: space-between; width: 100%;" theme="spacing">
  <vaadin-button style="margin-left: var(--lumo-space-s); width: 100%;">
    Nombre Hashtag 
  </vaadin-button>
  <label style="flex-shrink: 0; flex-grow: 0; margin-right: var(--lumo-space-s); align-self: center;">Numero de videos </label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
