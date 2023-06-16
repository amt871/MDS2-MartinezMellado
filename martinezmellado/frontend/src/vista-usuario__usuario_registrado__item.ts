import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-usuario__usuario_registrado__item')
export class VistaUsuario__usuario_registrado__item extends LitElement {
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
<vaadin-horizontal-layout style="width: 100%; align-items: center;">
 <vaadin-button id="bUser" style="width: 20%; height: 100%;">
  <img id="imageUser" style="max-width: 100%; max-height: 100%;">
 </vaadin-button>
 <vaadin-vertical-layout style="align-items: flex-start; justify-content: center; height: 100%; margin-left: var(--lumo-space-s); width: 15%;">
  <label id="labelUsuario">Usuario </label>
  <label id="labelSeguidores" style="flex-shrink: 0;">Seguidores </label>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center; align-self: center;">
  <label style="margin-left: var(--lumo-space-xl); flex-grow: 0; flex-shrink: 1;" id="labelDescripcion">Descripcion </label>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
