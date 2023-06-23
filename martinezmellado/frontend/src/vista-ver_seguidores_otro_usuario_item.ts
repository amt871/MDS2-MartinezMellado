import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_seguidores_otro_usuario_item')
export class VistaVer_seguidores_otro_usuario_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: relative;">
 <vaadin-horizontal-layout theme="" style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout style="width: 20%; height: 100%; align-items: center; justify-content: center;">
   <img id="image" style="max-width: 100%; max-height: 100%;">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 80%; height: 100%; align-items: center; padding-left: var(--lumo-space-s);">
   <label id="labelUsuario">Label</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
