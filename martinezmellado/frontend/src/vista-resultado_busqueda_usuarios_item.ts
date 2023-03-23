import { LitElement, html, css, customElement } from 'lit-element';
import '@polymer/iron-icon/iron-icon.js';
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
<vaadin-horizontal-layout class="content" style="width: 100%; align-items: center; flex-direction: row;">
 <iron-icon style="width: 10%; height: 100%;" icon="lumo:user"></iron-icon>
 <vaadin-vertical-layout theme="spacing-s" style="align-items: flex-start; justify-content: center; height: 100%;">
  <label>Usuario </label>
  <label>Seguidores</label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-items: center; justify-content: center;">
  <label>Descripcion</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="flex-shrink: 0; justify-content: flex-end;"></vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
