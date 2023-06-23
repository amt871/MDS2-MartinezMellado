import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-resultado_busqueda_usuarios_item')
export class VistaResultado_busqueda_usuarios_item extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; align-items: center; height: 100%; position: relative;">
 <vaadin-horizontal-layout style="width: 20%; height: 100%; align-items: center; justify-content: center;">
  <img id="image" style="max-width: 100%; max-height: 100%;">
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing-s" style="align-items: flex-start; justify-content: center; height: 100%; width: 20%;">
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: flex-start; width: 100%; height: 50%;">
   <label id="nombreUsuario">Usuario </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 50%;">
   <label id="seguidores">Seguidores</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout style="width: 60%; align-items: center; justify-content: center; align-self: center; height: 100%;">
  <label style="margin-left: var(--lumo-space-xl); flex-grow: 0; flex-shrink: 1;" id="descripcion">Descripcion</label>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
